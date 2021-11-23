@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    m_user_inputs = new java.util.ArrayList<>(m_order_Array.length);
    setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
    setContentView(R.layout.activity_shape);
    m_image = ((android.widget.ImageView) (findViewById(R.id.imageView1)));
    m_mask = ((android.widget.ImageView) (findViewById(R.id.mask)));
    addListenerOnView();
    com.example.bar.medialaxisbgu.ShapeActivity.fixArray(m_order_Array);
    m_imageId = m_order_Array[m_current_index];
    loadShape(m_imageId);
    improveColoring();
}