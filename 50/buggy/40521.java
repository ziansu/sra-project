@java.lang.Override
public final void bindView(@lombok.NonNull
android.view.View view, @lombok.NonNull
com.nextfaze.poweradapters.Holder holder) {
    outerToAdapter(holder.getPosition()).bindView(view, holder);
}