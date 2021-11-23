@java.lang.Override
public void readSettings(org.openide.WizardDescriptor wiz) {
    leg = ((nl.fontys.sofa.limo.domain.component.leg.Leg) (wiz.getProperty("leg")));
    getComponent().update(new java.util.ArrayList(leg.getProcedures()));
}