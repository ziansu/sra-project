@android.support.annotation.DrawableRes
private int getStatusIcon(com.airmap.airmapsdk.models.rules.AirMapRule.Status status) {
    switch (status) {
        case Conflicting :
            return R.drawable.ic_restricted;
        case MissingInfo :
            return R.drawable.ic_asterisk;
        case InformationRules :
            return R.drawable.ic_asterisk_yellow;
        case NotConflicting :
            return R.drawable.ic_checkmark;
    }
    return R.drawable.ic_asterisk_yellow;
}