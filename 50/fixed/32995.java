protected void markUncheckedValid() {
    if (preferredSugar) {
        acceptActualType(((org.eclipse.xtext.xbase.typesystem.conformance.ConformanceFlags.UNCHECKED) | (org.eclipse.xtext.xbase.typesystem.conformance.ConformanceFlags.PREFERRED_LAMBDA_SUGAR)));
    }else {
        acceptActualType(ConformanceFlags.UNCHECKED);
    }
}