@java.lang.Override
public void onLoad(final org.eclipse.californium.core.CoapResponse response) {
    java.lang.System.out.println(response.getCode());
    java.lang.System.out.println(response.getOptions());
    java.lang.System.out.println(response.getResponseText());
    java.lang.System.out.println("\nADVANCED\n");
    java.lang.System.out.println(org.eclipse.californium.core.Utils.prettyPrint(response));
}