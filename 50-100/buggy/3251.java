public void onSectionAttached(int number) {
    switch (number) {
        case 1 :
            mTitle = "Home";
            break;
        case 2 :
            mTitle = "Email";
            startActivity(new android.content.Intent(this, com.example.johnpham.hcftw.Email.class));
            break;
        case 3 :
            mTitle = "Calendar";
            startActivity(new android.content.Intent(this, com.example.johnpham.hcftw.Calender_.class));
            break;
        case 4 :
            mTitle = "Report";
            startActivity(new android.content.Intent(getApplicationContext(), com.example.johnpham.hcftw.Tutor_Report.class));
            break;
    }
}