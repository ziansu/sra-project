@java.lang.Override
public java.lang.Object visitPackageDirectivePMD(org.jetbrains.kotlin.psi.JetPackageDirective directive, java.lang.Object data) {
    org.testng.Assert.assertEquals(directive.getText(), "package org.jetbrains.pmdkotlin");
    return super.visitPackageDirectivePMD(directive, data);
}