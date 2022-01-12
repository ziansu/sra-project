public void setImageTypeSupported(com.smartdevicelink.proxy.rpc.enums.FileType imageTypeSupported) {
    if (imageTypeSupported != null) {
        store.put(com.smartdevicelink.proxy.rpc.ImageField.KEY_IMAGE_TYPE_SUPPORTED, imageTypeSupported);
    }else {
        store.remove(com.smartdevicelink.proxy.rpc.ImageField.KEY_IMAGE_TYPE_SUPPORTED);
    }
}