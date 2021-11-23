@org.junit.Test
public void shouldRenderZierIDTextView() {
    android.widget.TextView textView = ((android.widget.TextView) (activity.findViewById(R.id.idforclient)));
    junit.framework.Assert.assertNotNull(textView);
}