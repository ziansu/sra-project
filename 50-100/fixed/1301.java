public static uk.co.senab.photoview.PhotoMarker createNewMarker(android.content.Context context, android.widget.RelativeLayout wrapper, float x, float y, int resId) {
    return new uk.co.senab.photoview.PhotoMarker(edu.fiu.mpact.reuproject.Utils.createNewMarker(context, wrapper, resId), x, y, context.getResources().getInteger(R.integer.map_marker_size));
}