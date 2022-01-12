@com.fasterxml.jackson.annotation.JsonCreator
static com.spotify.docker.client.messages.ImageInfo create(@com.fasterxml.jackson.annotation.JsonProperty(value = "Id")
final java.lang.String id, @com.fasterxml.jackson.annotation.JsonProperty(value = "Parent")
final java.lang.String parent, @com.fasterxml.jackson.annotation.JsonProperty(value = "Comment")
final java.lang.String comment, @com.fasterxml.jackson.annotation.JsonProperty(value = "Created")
final java.util.Date created, @com.fasterxml.jackson.annotation.JsonProperty(value = "Container")
final java.lang.String container, @com.fasterxml.jackson.annotation.JsonProperty(value = "ContainerConfig")
final com.spotify.docker.client.messages.ContainerConfig containerConfig, @com.fasterxml.jackson.annotation.JsonProperty(value = "DockerVersion")
final java.lang.String dockerVersion, @com.fasterxml.jackson.annotation.JsonProperty(value = "Author")
final java.lang.String author, @com.fasterxml.jackson.annotation.JsonProperty(value = "Config")
final com.spotify.docker.client.messages.ContainerConfig config, @com.fasterxml.jackson.annotation.JsonProperty(value = "Architecture")
final java.lang.String architecture, @com.fasterxml.jackson.annotation.JsonProperty(value = "Os")
final java.lang.String os, @com.fasterxml.jackson.annotation.JsonProperty(value = "Size")
final java.lang.Long size, @com.fasterxml.jackson.annotation.JsonProperty(value = "VirtualSize")
final java.lang.Long virtualSize, @com.fasterxml.jackson.annotation.JsonProperty(value = "RootFS")
final com.spotify.docker.client.messages.RootFs rootFs) {
    return new com.spotify.docker.client.messages.AutoValue_ImageInfo(id, parent, comment, created, container, containerConfig, dockerVersion, author, config, architecture, os, size, virtualSize);
}