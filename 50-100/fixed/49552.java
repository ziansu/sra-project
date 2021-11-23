@android.support.annotation.Nullable
@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, @android.support.annotation.Nullable
android.view.ViewGroup container, @android.support.annotation.Nullable
android.os.Bundle savedInstanceState) {
    android.view.View rootView = inflater.inflate(R.layout.fragment_body_part, container, false);
    android.widget.ImageView imageView = ((android.widget.ImageView) (rootView.findViewById(R.id.body_part_image_view)));
    imageView.setImageResource(com.example.android.android_me.data.AndroidImageAssets.getHeads().get(0));
    return rootView;
}