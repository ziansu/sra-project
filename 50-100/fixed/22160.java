private static void dynamicArrange(int type, java.lang.String data, android.widget.TextView target) {
    if (android.text.TextUtils.isEmpty(data)) {
        target.setVisibility(View.GONE);
    }else {
        target.setVisibility(View.VISIBLE);
        target.setText(((com.seoul.hanokmania.views.adapters.BukchonExpListAdapter.BukchonUtils.MAP_TYPE.get(type)) + data));
        switch (type) {
            case com.seoul.hanokmania.views.adapters.BukchonExpListAdapter.BukchonUtils.TYPE_PHONE_NUM :
                android.text.util.Linkify.addLinks(target, Linkify.PHONE_NUMBERS);
                break;
            case com.seoul.hanokmania.views.adapters.BukchonExpListAdapter.BukchonUtils.TYPE_HOMEPAGE :
                android.text.util.Linkify.addLinks(target, Linkify.WEB_URLS);
                break;
        }
    }
}