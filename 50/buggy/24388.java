public static com.xpn.xwiki.web.ObjectPolicyType forName(java.lang.String name) {
    for (com.xpn.xwiki.web.ObjectPolicyType type : com.xpn.xwiki.web.ObjectPolicyType.values()) {
        if (name.equals(type.getName())) {
            return type;
        }
    }
    return null;
}