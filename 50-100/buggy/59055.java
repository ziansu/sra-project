private boolean validateForm(android.content.Context ctx) {
    if (areFieldsFilled(ctx)) {
        if ((((((validation1(ctx)) && (validation2(ctx))) && (validation3(ctx))) && (validation4(ctx))) && (validation5(ctx))) && (validation6(ctx))) {
            hideallErrors();
            return true;
        }else {
            return false;
        }
    }else {
        return false;
    }
}