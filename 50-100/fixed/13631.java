public void onClick(android.content.DialogInterface dialog, int id) {
    alertDialogBuilder.setCancelable(true);
    if ((getActivity().getIntent().getExtras()) != null) {
        android.content.Intent intent = new android.content.Intent(getActivity(), droidahmed.com.jm3eia.start.MainActivity.class);
        intent.putExtra("CartAuth", "CartAuth");
        startActivity(intent);
    }else {
        android.content.Intent intent = new android.content.Intent(getActivity(), droidahmed.com.jm3eia.start.MainActivity.class);
        startActivity(intent);
    }
}