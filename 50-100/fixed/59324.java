public boolean startService(java.lang.String className) {
    java.lang.Class<? extends android.app.Service> serviceClass = com.alu.service.ServiceManager.getServiceClassByName(className);
    if ((serviceClass != null) && (!(isServiceRunning(serviceClass)))) {
        android.util.Log.d(com.alu.service.ServicePlugin.LOG_KEY, ("Starting service : " + className));
        cordova.getActivity().startService(new android.content.Intent(cordova.getActivity(), serviceClass));
        return true;
    }else {
        return false;
    }
}