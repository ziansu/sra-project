private boolean isUnrecoverable(java.lang.Throwable t) {
    if ((t != null) && ((t.getCause()) != null)) {
        java.lang.Throwable cause = t.getCause();
        if (cause instanceof java.lang.StackOverflowError) {
            return true;
        }else
            if (cause instanceof java.lang.VirtualMachineError) {
                return true;
            }else
                if (cause instanceof java.lang.ThreadDeath) {
                    return true;
                }else
                    if (cause instanceof java.lang.LinkageError) {
                        return true;
                    }
                
            
        
    }
    return false;
}