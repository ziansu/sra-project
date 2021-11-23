protected void markVoidCompatible() {
    if (preferredSugar) {
        getExpectation().acceptActualType(resultClosureType, (((((org.eclipse.xtext.xbase.typesystem.conformance.ConformanceFlags.CHECKED_SUCCESS) | (org.eclipse.xtext.xbase.typesystem.conformance.ConformanceFlags.LAMBDA_VOID_COMPATIBLE)) | (org.eclipse.xtext.xbase.typesystem.conformance.ConformanceFlags.PROPAGATED_TYPE)) | (org.eclipse.xtext.xbase.typesystem.conformance.ConformanceFlags.SEALED)) | (org.eclipse.xtext.xbase.typesystem.conformance.ConformanceFlags.PREFERRED_LAMBDA_SUGAR)));
    }else {
        getExpectation().acceptActualType(resultClosureType, ((((org.eclipse.xtext.xbase.typesystem.conformance.ConformanceFlags.CHECKED_SUCCESS) | (org.eclipse.xtext.xbase.typesystem.conformance.ConformanceFlags.LAMBDA_VOID_COMPATIBLE)) | (org.eclipse.xtext.xbase.typesystem.conformance.ConformanceFlags.PROPAGATED_TYPE)) | (org.eclipse.xtext.xbase.typesystem.conformance.ConformanceFlags.SEALED)));
    }
}