public static void main(java.lang.String[] args) throws org.fastj.fit.intf.DataInvalidException, org.fastj.fit.intf.ParamIncertitudeException {
    for (java.lang.String arg : args) {
        if ("-script".equals(arg)) {
            org.fastj.fit.runner.TScriptRunner.run(args);
            return ;
        }else
            if ("-case".equals(arg)) {
                org.fastj.fit.runner.TCaseRunner.main(args);
                return ;
            }
        
    }
    if ((args != null) && ((args.length) > 0)) {
        org.fastj.fit.runner.TCaseRunner.main(args);
        return ;
    }
    org.fastj.fit.runner.UIRunner.main(args);
}