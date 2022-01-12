private void setFragment(java.lang.String title) {
    if (title == "Inbox") {
        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new uw.virtualpin.MessageFragment()).addToBackStack(null).commit();
        this.setTitle("Inbox");
    }else
        if (title == "Drop pin") {
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new uw.virtualpin.DropPinFragment()).addToBackStack(null).commit();
            this.setTitle("Drop pin");
        }
    
}