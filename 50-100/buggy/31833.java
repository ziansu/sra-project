public void setFragment(int id) {
    switch (id) {
        case R.id.nav_calc :
            com.example.pau.deltacalc.CalculatorFragment calculatorFragment = new com.example.pau.deltacalc.CalculatorFragment();
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, calculatorFragment).commit();
            break;
        case R.id.nav_example :
            com.example.pau.deltacalc.ExampleFragment exampleFragment = new com.example.pau.deltacalc.ExampleFragment();
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, exampleFragment).commit();
            break;
        case R.id.nav_settings :
            break;
    }
}