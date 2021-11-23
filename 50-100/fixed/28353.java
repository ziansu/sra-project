public java.lang.String singleton_l2gateway_create_test() {
    java.lang.String url = (base) + "/l2-gateways";
    java.lang.String content = " { \"l2_gateway\": { \"name\": \"gateway1\"," + (((("\"id\": \"3b0ef8f4-82c7-44d4-a4fb-6177f9a21977\"," + "\"tenant_id\": \"45977fa2dbd7482098dd68d0d8970117\",") + "\"devices\": [{\"device_name\": \"device1\",") + "\"interfaces\": [{\"name\": \"interface1\", \"segmentation_id\": [100] }] ") + "}] } }");
    org.opendaylight.neutron.e2etest.ITNeutronE2E.test_create(url, content, "L2 Gateway Singleton Post Failed");
    return content;
}