@java.lang.Override
public void onClick(android.view.View v) {
    switch (v.getId()) {
        case R.id.button_add_new_route :
            android.content.Intent intent = new android.content.Intent(getActivity(), com.example.routemapper.CreateRouteActivity.class);
            intent.putExtra(com.example.routemapper.RouteListFragment.KEY_EXTRA_ROUTE_ID, 0);
            startActivity(intent);
            break;
    }
}