public int getHint() {
    if (!(componentCount)) {
        return R.string.component_count;
    }
    if (!(lampRequirementsMet)) {
        return R.string.lamp_off;
    }
    if (!(isFullCircle)) {
        return R.string.no_full_circle;
    }
    if (!(hasSwitch)) {
        return R.string.switch_required;
    }
    if (!(hasResistor)) {
        return R.string.resistance_required;
    }
    return 0;
}