private android.widget.CheckBox addSupport(android.widget.CheckBox check, dev.ukanth.ufirewall.AppListArrayAdapter.ViewHolder entry, dev.ukanth.ufirewall.Api.PackageInfoData app, int flag) {
    if (check != null) {
        check.setTag(app);
        switch (flag) {
            case 0 :
                check.setChecked(app.selected_roam);
                break;
            case 1 :
                check.setChecked(app.selected_vpn);
                break;
            case 2 :
                check.setChecked(app.selected_lan);
                break;
        }
    }
    return check;
}