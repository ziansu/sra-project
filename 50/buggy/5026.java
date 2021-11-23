@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    ((org.wordpress.android.WordPress) (getApplication())).component().inject(this);
}