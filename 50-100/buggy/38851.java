protected void markCompatibleParameterList() {
    if (preferredSugar) {
        getExpectation().acceptActualType(resultClosureType, ((((org.eclipse.xtext.xbase.typesystem.conformance.ConformanceFlags.CHECKED) | (org.eclipse.xtext.xbase.typesystem.conformance.ConformanceFlags.LAMBDA_PARAMETER_COMPATIBLE)) | (org.eclipse.xtext.xbase.typesystem.conformance.ConformanceFlags.SEALED)) | (org.eclipse.xtext.xbase.typesystem.conformance.ConformanceFlags.PREFERRED_LAMBDA_SUGAR)));
    }else {
        getExpectation().acceptActualType(resultClosureType, (((org.eclipse.xtext.xbase.typesystem.conformance.ConformanceFlags.CHECKED) | (org.eclipse.xtext.xbase.typesystem.conformance.ConformanceFlags.LAMBDA_PARAMETER_COMPATIBLE)) | (org.eclipse.xtext.xbase.typesystem.conformance.ConformanceFlags.SEALED)));
    }
}