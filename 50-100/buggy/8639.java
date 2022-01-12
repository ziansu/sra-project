@java.lang.Override
public java.lang.String getText(mage.abilities.Mode mode) {
    if (((staticText) != null) && (!(staticText.isEmpty()))) {
        return staticText;
    }
    if ((targetName.length()) > 0) {
        return (targetName) + " doesn't untap during its controller's next untap step";
    }else {
        return ("Target " + (mode.getTargets().get(0).getTargetName())) + " doesn't untap during its controller's next untap step";
    }
}