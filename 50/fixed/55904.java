public static com.defch.blogwbly.MyApplication getInstance() {
    if ((com.defch.blogwbly.MyApplication.instance) == null) {
        com.defch.blogwbly.MyApplication.instance = new com.defch.blogwbly.MyApplication();
    }
    return com.defch.blogwbly.MyApplication.instance;
}