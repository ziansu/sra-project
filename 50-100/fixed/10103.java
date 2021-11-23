@java.lang.Override
public android.support.v4.app.Fragment getItem(int position) {
    switch (position) {
        case 0 :
            return ruhrpott.owasp.com.vuln_app_1.Hello_Page.newInstance();
        case 1 :
            return ruhrpott.owasp.com.vuln_app_1.Prepare.newInstance();
        case 2 :
            return ruhrpott.owasp.com.vuln_app_1.Basic_Http.newInstance();
        case 3 :
            return ruhrpott.owasp.com.vuln_app_1.Logcat_Output.newInstance();
    }
}