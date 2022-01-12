@java.lang.Override
public com.tq.clickfunnel.lambda.dynamodb.model.ContactItem get(java.lang.String email) {
    if ((email == null) || (email.isEmpty()))
        return null;
    
    return loadItem(getItem(), email);
}