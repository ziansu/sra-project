@java.lang.Override
public java.lang.Object visitPackageDirectivePMD(org.jetbrains.kotlin.psi.JetPackageDirective directive, java.lang.Object data) {
    org.testng.Assert.assertEquals(data, "package org.jetbrains.pmdkotlin");
    return super.visitPackageDirectivePMD(directive, data);
}