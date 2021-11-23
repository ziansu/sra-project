private static void stop(co.virtualdragon.vanillaVotifier.Votifier votifier) {
    try {
        votifier.getServer().stop();
    } catch (java.lang.Exception e) {
        java.util.HashMap<java.lang.String, java.lang.String> substitutions = new java.util.HashMap<java.lang.String, java.lang.String>();
        substitutions.put("exception", org.apache.commons.lang3.exception.ExceptionUtils.getStackTrace(e));
        votifier.getOutputWriter().println(new org.apache.commons.lang3.text.StrSubstitutor(substitutions).replace(votifier.getLanguagePack().getString("s12")));
    }
}