private static void dynamicArrange(int type, java.lang.String data, android.widget.TextView target) {
    if (android.text.TextUtils.isEmpty(data)) {
        target.setVisibility(View.GONE);
    }else {
        target.setVisibility(View.VISIBLE);
        switch (type) {
            case com.seoul.hanokmania.views.adapters.BukchonExpListAdapter.BukchonUtils.TYPE_PHONE_NUM :
                android.text.util.Linkify.addLinks(target, Linkify.PHONE_NUMBERS);
            case com.seoul.hanokmania.views.adapters.BukchonExpListAdapter.BukchonUtils.TYPE_HOMEPAGE :
                android.text.util.Linkify.addLinks(target, Linkify.WEB_URLS);
            default :
                target.setText(((com.seoul.hanokmania.views.adapters.BukchonExpListAdapter.BukchonUtils.MAP_TYPE.get(type)) + data));
                break;
        }
    }
}