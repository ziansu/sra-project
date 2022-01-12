public java.lang.String singleton_fw_rule_create_test() {
    java.lang.String url = (base) + "/fw/firewall_rules";
    java.lang.String content = "{ \"firewall_rule\": { \"action\": \"allow\"," + (((((((("\"description\": \"\", \"destination_ip_address\": null," + "\"destination_port\": \"80\", \"enabled\": true,") + "\"firewall_policy_id\": null,") + "\"id\": \"8722e0e0-9cc9-4490-9660-8c9a5732fbb0\",") + "\"ip_version\": 4, \"name\": \"ALLOW_HTTP\",") + "\"position\": null, \"protocol\": \"tcp\",") + "\"shared\": false, \"source_ip_address\": null,") + "\"source_port\": null,") + "\"tenant_id\": \"45977fa2dbd7482098dd68d0d8970117\" } }");
    org.opendaylight.neutron.e2etest.ITNeutronE2E.test_create(url, content, "Firewall Rule Singleton Post Failed");
    return content;
}