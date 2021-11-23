protected void loadThisOrOwner() {
    if (isInnerClass()) {
        visitFieldExpression(new org.codehaus.groovy.classgen.FieldExpression(controller.getClassNode().getDeclaredField("owner")));
    }else {
        loadThis();
    }
}