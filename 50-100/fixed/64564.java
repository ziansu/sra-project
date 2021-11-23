@java.lang.Override
public void onClick(android.view.View v) {
    switch (v.getId()) {
        case R.id.ibAC_carWash :
            android.content.Intent intent = new android.content.Intent(getActivity(), com.example.porownywarkapaliw.MapPart.Maps.class);
            intent.putExtra(MainActivity.KEY_MAP_CRITERIA, true);
            startActivity(intent);
            break;
    }
}