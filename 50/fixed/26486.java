@org.junit.Test
public void shouldRenderChildNameTextView() {
    android.widget.TextView nameView = ((android.widget.TextView) (activity.findViewById(R.id.name)));
    assertNotNull(nameView);
}