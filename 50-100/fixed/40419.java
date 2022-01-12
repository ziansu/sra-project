@java.lang.Override
public void setContent(configuration.Configuration config) {
    org.eclipse.emf.henshin.model.Rule rule = config.getRule();
    org.eclipse.emf.transaction.TransactionalEditingDomain domain = org.eclipse.emf.transaction.util.TransactionUtil.getEditingDomain(rule);
    domain.addResourceSetListener(new org.eclipse.emf.henshin.variability.ui.views.VariabilityView.ConfigurationListener());
    viewer.setInput(config);
    ruleNameLabel.setText(("Rule " + (rule.getName())));
    loadFavoritesMenu.setChecked(configurationProvider.isFavorite(config));
    writableValue.setValue(rule);
    add.setEnabled(true);
    delete.setEnabled(true);
}