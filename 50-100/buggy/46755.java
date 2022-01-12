@java.lang.Override
protected java.lang.String getUrlRequestAction(java.lang.String suffix) {
    if (!(com.gitblit.utils.StringUtils.isEmpty(suffix))) {
        if (suffix.startsWith(gitReceivePack)) {
            return gitReceivePack;
        }else
            if (suffix.startsWith(gitUploadPack)) {
                return gitUploadPack;
            }else
                if (suffix.contains("?service=git-receive-pack")) {
                    return gitReceivePack;
                }else
                    if (suffix.contains("?service=git-upload-pack")) {
                        return gitUploadPack;
                    }
                
            
        
    }
    return null;
}