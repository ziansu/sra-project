@java.lang.Override
public void bindView(@lombok.NonNull
android.view.View view, @lombok.NonNull
com.nextfaze.poweradapters.Holder holder) {
    outerToAdapter(holder.getPosition()).bindView(view, holder);
}