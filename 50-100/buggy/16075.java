@java.lang.Override
public android.view.View getView(int position, android.view.View convertView, android.view.ViewGroup parent) {
    if (convertView == null) {
        convertView = android.view.LayoutInflater.from(getContext()).inflate(R.layout.fragment_cast_device_list_item, null);
    }
    android.support.v7.media.MediaRouter.RouteInfo routeInfo = org.catrobat.catroid.cast.CastManager.getInstance().getRouteInfos().get(position);
    ((android.widget.TextView) (convertView.findViewById(R.id.cast_device_name))).setText(routeInfo.getName());
    return convertView;
}