@java.lang.Override
public graphql.schema.GraphQLInputType getInputType(com.bretpatterson.schemagen.graphql.IGraphQLObjectMapper graphQLObjectMapper, java.lang.reflect.Type type) {
    if (type instanceof java.lang.reflect.ParameterizedType) {
        java.lang.reflect.ParameterizedType parameterizedType = ((java.lang.reflect.ParameterizedType) (type));
        return new graphql.schema.GraphQLList(graphQLObjectMapper.getInputType(parameterizedType.getActualTypeArguments()[0]));
    }else {
        return new graphql.schema.GraphQLList(graphQLObjectMapper.getInputType(java.lang.Object.class));
    }
}