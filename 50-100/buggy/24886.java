public static void calAgentsFee() {
    com.example.aleksandr.godspeedinvestments.OfferFragment.agFee = ((android.widget.TextView) (com.example.aleksandr.godspeedinvestments.OfferFragment.rootView.findViewById(R.id.afOutTV)));
    double afRepValue;
    double agentsFee;
    try {
        afRepValue = java.lang.Double.parseDouble(com.example.aleksandr.godspeedinvestments.OfferFragment.afRepVal.getText().toString());
        agentsFee = afRepValue * 0.06;
        com.example.aleksandr.godspeedinvestments.OfferFragment.agFee.setText(("" + agentsFee));
    } catch (java.lang.Exception e) {
        com.example.aleksandr.godspeedinvestments.OfferFragment.agFee.setText("There would have been an error at this point");
    }
}