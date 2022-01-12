public void brokenFunction(android.view.View view) {
    if (auntEdith.getText().toString().equals("Timmy")) {
        java.lang.System.out.println("Timmy fixed a bug!");
    }
    java.lang.System.out.println("If this appears in your console, you fixed a bug.");
    android.content.Intent intent = new android.content.Intent(this, mmbuw.com.brokenproject.AnotherBrokenActivity.class);
    java.lang.String message = "This string will be passed to the new activity";
    startActivity(intent);
}