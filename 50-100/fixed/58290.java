@java.lang.Override
public java.lang.Object visitEPackage(final eu.modelwriter.core.alloyinecore.recognizer.AlloyInEcoreParser.EPackageContext ctx) {
    final org.eclipse.emf.ecore.EPackage ePackage = eu.modelwriter.core.alloyinecore.ui.cs2as.mapping.EPackageCreator.factory.createEPackage();
    final java.lang.String name = ctx.name.getText();
    ePackage.setName(name);
    eu.modelwriter.core.alloyinecore.ui.cs2as.mapping.EPackageCreator.getName2epackage().put(name, ePackage);
    return super.visitEPackage(ctx);
}