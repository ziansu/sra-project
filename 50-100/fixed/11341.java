public java.util.List<com.intellij.plugins.haxe.model.HaxeParameterModel> getParameters() {
    java.util.List<com.intellij.plugins.haxe.model.HaxeParameterModel> _parameters = new java.util.ArrayList<com.intellij.plugins.haxe.model.HaxeParameterModel>();
    com.intellij.plugins.haxe.model.HaxeParameterList parameterList = com.intellij.plugins.haxe.util.UsefulPsiTreeUtil.getChild(this.haxeMethod, com.intellij.plugins.haxe.model.HaxeParameterList.class);
    if (parameterList != null) {
        for (com.intellij.plugins.haxe.model.HaxeParameter parameter : parameterList.getParameterList()) {
            _parameters.add(new com.intellij.plugins.haxe.model.HaxeParameterModel(parameter));
        }
    }
    return _parameters;
}