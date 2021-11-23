@java.lang.Override
public java.util.List<org.kuali.rice.core.api.util.KeyValue> getKeyValues() {
    java.util.List<org.kuali.rice.core.api.util.KeyValue> keyValues = org.kuali.coeus.common.impl.rolodex.RolodexAddressFlagValuesFinder.KEY_VALUES;
    keyValues.add(0, new org.kuali.rice.core.api.util.ConcreteKeyValue(org.kuali.coeus.sys.framework.keyvalue.PrefixValuesFinder.getPrefixKey(), org.kuali.coeus.sys.framework.keyvalue.PrefixValuesFinder.getDefaultPrefixValue()));
    return keyValues;
}