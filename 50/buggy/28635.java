@java.lang.Override
public void configure(com.google.inject.Binder binder) {
    super.configure(binder);
    binder.bind(org.eclipse.xtext.naming.IQualifiedNameConverter.class).to(org.softlang.megal.language.scoping.MegalQualifiedNameConverter.class);
}