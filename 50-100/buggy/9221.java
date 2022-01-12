@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
    android.view.View rootView = null;
    if ((customLayout) == 0) {
        rootView = generateCaptchaView(inflater, container, savedInstanceState);
        android.widget.TextView captchaPrompt = ((android.widget.TextView) (rootView.findViewById(R.id.txt_captcha_prompt)));
        if (((customText) != null) && (captchaPrompt != null))
            captchaPrompt.setText(customText);
        
    }else {
        inflater.inflate(customLayout, container, false);
    }
    return rootView;
}