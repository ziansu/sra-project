public static int severity(final hudson.model.Result result) {
    if (result.equals(Result.FAILURE)) {
        return 4;
    }else
        if (result.equals(Result.UNSTABLE)) {
            return 3;
        }else
            if (result.equals(Result.NOT_BUILT)) {
                return 2;
            }else
                if (result.equals(Result.ABORTED)) {
                    return 1;
                }
            
        
    
    return 0;
}