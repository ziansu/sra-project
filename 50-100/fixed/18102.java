public int getHint() {
    if (!(lampRequirementsMet)) {
        return R.string.lamp_off;
    }
    if (!(hasSwitch)) {
        return R.string.switch_required;
    }
    if (!(hasResistor)) {
        return R.string.resistance_required;
    }
    if (!(isFullCircle)) {
        return R.string.no_full_circle;
    }
    if (!(componentCount)) {
        return R.string.component_count;
    }
    return 0;
}