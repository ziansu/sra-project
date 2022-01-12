void createTypeProposalLabel(char[] fullName, org.eclipse.lsp4j.CompletionItem item) {
    int qIndex = findSimpleNameStart(fullName);
    java.lang.StringBuilder nameBuffer = new java.lang.StringBuilder();
    nameBuffer.append(new java.lang.String(fullName, qIndex, ((fullName.length) - qIndex)));
    nameBuffer.append(org.eclipse.jdt.ls.core.internal.contentassist.CompletionProposalDescriptionProvider.PACKAGE_NAME_SEPARATOR);
    nameBuffer.append(new java.lang.String(fullName, 0, (qIndex - 1)));
    item.setLabel(nameBuffer.toString());
}