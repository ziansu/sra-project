private void attachPropertiesFragment() throws java.lang.IllegalAccessException, java.lang.InstantiationException {
    java.lang.Class<? extends pl.karol202.paintplus.tool.ToolProperties> propertiesClass = paintView.getTool().getPropertiesFragmentClass();
    android.app.Fragment properties = propertiesClass.newInstance();
    android.os.Bundle propArgs = new android.os.Bundle();
    propArgs.putInt("tool", getTools().getToolId(paintView.getTool()));
    properties.setArguments(propArgs);
    android.app.FragmentTransaction propTrans = fragments.beginTransaction();
    propTrans.replace(R.id.propertiesFragment, properties);
    propTrans.commit();
}