@java.lang.Override
public boolean hasCorrections(org.eclipse.dltk.core.ISourceModule unit, org.eclipse.dltk.compiler.problem.IProblemIdentifier identifier) {
    org.eclipse.php.internal.core.compiler.ast.parser.PhpProblemIdentifier problem = org.eclipse.php.internal.core.compiler.ast.parser.PhpProblemIdentifier.getProblem(identifier);
    if (problem == null)
        return false;
    
    switch (problem) {
        case AbstractMethodInAbstractClass :
        case AbstractMethodsInConcreteClass :
        case BodyForAbstractMethod :
        case MethodRequiresBody :
        case AbstractMethodMustBeImplemented :
        case ClassExtendFinalClass :
        case DuplicateImport :
        case ImportNotFound :
        case SuperclassMustBeAClass :
        case UndefinedType :
        case UnnecessaryImport :
        case UnusedImport :
            return true;
        default :
            break;
    }
    return false;
}