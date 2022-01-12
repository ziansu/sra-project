private static boolean checkInheritance(final consulo.dotnet.psi.search.searches.DirectTypeInheritorsSearch.SearchParameters p, final java.lang.String vmQName, final consulo.dotnet.psi.DotNetTypeDeclaration candidate) {
    return com.intellij.openapi.application.ApplicationManager.getApplication().runReadAction(new com.intellij.openapi.util.Computable<java.lang.Boolean>() {
        @java.lang.Override
        public java.lang.Boolean compute() {
            return (!(p.isCheckInheritance())) || (candidate.isInheritor(vmQName, false));
        }
    });
}